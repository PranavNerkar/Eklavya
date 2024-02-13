import { useReducer, useState } from "react";

export default function StudentRegistrationForm() {
  const init = {
    fname: { value: "", valid: false, touched: false, error: "" },
    lname: { value: "", valid: false, touched: false, error: "" },
    email: { value: "", valid: false, touched: false, error: "" },
    phone: { value: 0, valid: false, touched: false, error: "" },
    age: { value: 0, valid: false, touched: false, error: "" },
    gender: { value: 0, valid: false, touched: false, error: "" },
    pwd: { value: 0, valid: false, touched: false, error: "" },
    cpwd: { value: 0, valid: false, touched: false, error: "" },
    question: { value: 0, valid: false, touched: false, error: "" },
    answer: { value: 0, valid: false, touched: false, error: "" },
    formValid: false,
  };

  const reducer = (state, action) => {
    switch (action.type) {
      case "update":
        return {
          ...state,
          [action.data.key]: {
            ...state[action.data.key],
            value: action.data.val,
            touched: action.data.touched,
            valid: action.data.valid,
            error: action.data.error,
          },
          formValid: action.data.formValid,
        };
      case "reset":
        return init;
      default:
        console.log("default switch");
        return state;
    }
  };

  const [provider, dispatch] = useReducer(reducer, init);
  const [displayAlert, setDisplayAlert] = useState(false);
  const [errorMsg, setErrorMsg] = useState("");
  const [alertType, setAlertType] = useState("danger");

  function showErrorMessage(msg, time) {
    setDisplayAlert(true);
    setErrorMsg(msg);
    if (time !== 0) {
      setTimeout(() => {
        setDisplayAlert(false);
      }, time);
    }
  }

  const handleChange = (key, value) => {
    const { valid, error } = validateData(key, value);
    let formValid = true;
    for (let k in provider) {
      if (provider[k].valid === false) {
        formValid = false;
        break;
      }
    }
    dispatch({
      type: "update",
      data: {
        key,
        val: value,
        touched: true,
        valid,
        error,
        formValid: formValid,
      },
    });
  };

  function checkPasswordsMatch() {
    const password = provider.pwd.value;
    const confirmPassword = provider.cpwd.value;
    var ispwvalid = false;
    console.log(" pass " + password);
    console.log(" paas confirm" + confirmPassword);
    if (password === confirmPassword) {
      ispwvalid = true;
    }
    console.log("pw matched: " + ispwvalid);
    return ispwvalid;
  }

  const validateData = (key, value) => {
    console.log(key, value);
    let valid = true;
    let error = "";
    switch (key) {
      case "fname":
      case "lname":
        var pattern = new RegExp("^[A-Z][a-z]+$");
        if (!pattern.test(value)) {
          valid = false;
          error = "Invalid Name (Only Alphabets allowed)";
        }
        break;
  
      case "email":
        pattern = /^[a-zA-Z]{3,20}\d{0,5}@/;
        if (!pattern.test(value)) {
          valid = false;
          error = "Invalid Email address";
        }
        break;
  
      case "phone":
        pattern = /^\d{10}$/;
        if (!pattern.test(value)) {
          valid = false;
          error = "Invalid Phone Number";
        }
        break;
  
      case "age":
        pattern = /^\d{2}$/;
        if (!pattern.test(value)) {
          valid = false;
          error = "Enter Proper Age";
        }
        break;
  
    //   case "pwd":
    //     pattern = /^(?=.[a-z])(?=.[A-Z])(?=.*[!@#$%^&]).{8,20}$/;
    //     if (!pattern.test(value)) {
    //       valid = false;
    //       error = "Enter valid Password";
    //     }
    //     break;

    case "pwd":
  pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&]).{8,20}$/;
  if (!pattern.test(value)) {
    valid = false;
    error = "Password must contain at least one lowercase letter, one uppercase letter, one special character, and be between 8 and 20 characters long";
  }
  break;

  
      case "cpwd":
        const password = provider.pwd.value;
        if (password !== value) {
          valid = false;
          error = "Passwords do not match";
        }
        break;
  
      default:
        console.log("default switch");
    }
    return { valid: valid, error: error };
  };
  

  const submitData = (e) => {
    e.preventDefault();

    const passwordsMatch = checkPasswordsMatch();

    if (!passwordsMatch) {
      setAlertType("alert-warning");
      showErrorMessage("Passwords do not match", 5000);
      return;
    }
    //
    if (provider.formValid === false) {
      setAlertType("alert-danger");
      showErrorMessage("Please enter valid data", 5000);
      return;
    }

    fetch("http://localhost:9000/checkusernameexist", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ username: provider.username.value }),
    })
      .then((response) => response.json())
      .then((data) => {
        if (!data) {
          fetch("http://localhost:9000/insert", {
            method: "POST",
            headers: {
              "Content-Type": "application/json",
            },
            body: JSON.stringify({
              fname: provider.fname.value,
              lname: provider.lname.value,
              email: provider.email.value,
              phone: provider.phone.value,
              age: provider.age.value,
              gender: provider.gender.value,
              pwd: provider.pwd.value,
              question: provider.squestion.value,
              answer: provider.answer.value,
            }),
          })
            .then((response) => response.json())
            .then((data) => {
              console.log("insert data: " + data.registered);

              if (data.registered === true) {
                setAlertType("alert-success");
                showErrorMessage(
                  "Registration successful. Please log in.",
                  5000
                );
                return;
              }
            })
            .catch((error) => {
              console.error("Error:", error);
            });
        }
        if (data) {
          setAlertType("alert-info");
          showErrorMessage("Username already exists. Please log in.", 5000);

          // console.log(document.getElementById("successalert").textContent)
          // setDisplayAlert(true)

          return;
        }
      })
      .catch((error) => {
        console.error("Error:", error);
      });
  };

  return (
    <form>
      <div className="container mt-5 mb-5 border border-dark rounded ">
        <div className="mt-3 mb-5 display-5 text-center text-primary">
          <strong><b>User Registration Form</b></strong>
        </div>
        {/* Row 1 */}
        <div className="row">
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="fname" className="form-label">
                First Name
              </label>
              <input
                type="text"
                className="form-control "
                id="fname"
                placeholder="Enter Your First Name"
                onChange={(e) => handleChange("fname", e.target.value)}
                onBlur={(e) => handleChange("fname", e.target.value)}
              />
              <span className="error text-danger">
                {provider.fname.touched &&
                  !provider.fname.valid &&
                  provider.fname.error}
              </span>
            </div>
          </div>
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="lname" className="form-label">
                Last Name
              </label>
              <input
                type="text"
                className="form-control"
                id="lname"
                placeholder="Enter Your Last Name"
                onChange={(e) => handleChange("lname", e.target.value)}
                onBlur={(e) => handleChange("lname", e.target.value)}
              />
              <span className="error text-danger">
                {provider.lname.touched &&
                  !provider.lname.valid &&
                  provider.lname.error}
              </span>
            </div>
          </div>
        </div>

        {/* Row 2 */}
        <div className="row">
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="email" className="form-label">
                E-mail
              </label>
              <input
                type="email"
                className="form-control"
                id="email"
                placeholder="Enter Your Email ID"
                onChange={(e) => handleChange("email", e.target.value)}
                onBlur={(e) => handleChange("email", e.target.value)}
              />
              <span className="error text-danger">
                {provider.email.touched &&
                  !provider.email.valid &&
                  provider.email.error}
              </span>
            </div>
          </div>
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="number" id="number" className="form-label">
                Mobile Number
              </label>
              <input
                type="number"
                className="form-control"
                id="number"
                placeholder="Enter Your Mobile Number"
                onChange={(e) => handleChange("phone", e.target.value)}
                onBlur={(e) => handleChange("phone", e.target.value)}
              />
              <span className="error text-danger">
                {provider.phone.touched &&
                  !provider.phone.valid &&
                  provider.phone.error}
              </span>
            </div>
          </div>
        </div>

        {/* Row 3 */}
        <div className="row">
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="age" id="age" className="form-label">
                Age
              </label>
              <input
                type="number"
                className="form-control"
                id="age"
                maxLength={2}
                placeholder="Enter Your Age"
                onChange={(e) => handleChange("age", e.target.value)}
                onBlur={(e) => handleChange("age", e.target.value)}
              />
              <span className="error text-danger">
                {provider.age.touched &&
                  !provider.age.valid &&
                  provider.age.error}
              </span>
            </div>
          </div>
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="gender" id="gender" className="form-label">
                Gender
              </label>
              <select className="form-select">
                <option id="idgender" className="form-option" value="gender1">
                  Select Gender
                </option>
                <option id="idgender" className="form-option" value="gender2">
                  Male
                </option>
                <option id="idgender" className="form-option" value="gender3">
                  Female
                </option>
                <option id="idgender" className="form-option" value="gender4">
                  Other
                </option>
              </select>
            </div>
          </div>
        </div>

        {/* Row 4 */}
        <div className="row">
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="squestion" className="form-label">
                Security Question
              </label>
              <select className="form-select">
                <option
                  id="squestion"
                  className="form-option"
                  value="question1"
                >
                  Select Security Question
                </option>
                <option
                  id="squestion"
                  className="form-option"
                  value="question2"
                >
                  What is the name of your favorite Indian movie?
                </option>
                <option
                  id="squestion"
                  className="form-option"
                  value="question3"
                >
                  What is the name of the street you grew up on?
                </option>
                <option
                  id="squestion"
                  className="form-option"
                  value="question4"
                >
                  What is your favorite Indian dish?
                </option>
                <option
                  id="squestion"
                  className="form-option"
                  value="question5"
                >
                  What is the name of your first pet?
                </option>
                <option
                  id="squestion"
                  className="form-option"
                  value="question6"
                >
                  What is the name of the school you attended in the 10th grade?
                </option>
              </select>
            </div>
          </div>
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="sanswer" className="form-label">
                Answer
              </label>
              <input
                type="text"
                className="form-control"
                id="sanswer"
                placeholder="Answer... "
              />
            </div>
          </div>
        </div>

        {/* Row 5 */}
        <div className="row">
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="pwd" className="form-label">
                Password
              </label>
              <input
                type="password"
                className="form-control"
                id="pwd"
                placeholder="Enter your password"
                onChange={(e) => handleChange("pwd", e.target.value)}
                onBlur={(e) => handleChange("pwd", e.target.value)}
              />
              <span className="error text-danger">
                {provider.pwd.touched &&
                  !provider.pwd.valid &&
                  provider.pwd.error}
              </span>
            </div>
          </div>
          <div className="col">
            <div className="mb-3 border bg-light rounded p-2">
              <label htmlFor="cpwd" className="form-label">
                Confirm Password
              </label>
              <input
                type="password"
                className="form-control"
                id="cpwd"
                placeholder="Confirm password"
                onChange={(e) => handleChange("cpwd", e.target.value)}
                onBlur={(e) => handleChange("cpwd", e.target.value)}
              />
              <span className="error text-danger">
                {provider.cpwd.touched &&
                  !provider.cpwd.valid &&
                  provider.cpwd.error}
              </span>
            </div>
          </div>
        </div>

        <div className="row">
          <div className="row text-center m-3">
            <div className="col">
              <button
                className="btn btn-primary col-6"
                type="submit"
                onClick={(e) => {
                  submitData(e);
                }}
              >
                Register
              </button>
            </div>
            <div className="col">
              <button
                className="btn btn-outline-danger col-6"
                type="reset"
                onClick={(e) => {
                  dispatch({
                    type: "reset",
                  });
                }}
              >
                Clear
              </button>
            </div>
          </div>
        </div>
      </div>

      {/* {JSON.stringify(provider) + ""} */}
    </form>
  );
}