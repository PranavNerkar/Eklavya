import React, { useState } from "react";

const SignupForm = () => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [contact, setContact] = useState("");
  const [password, setPassword] = useState("");
  const [address, setAddress] = useState("");
  const [dob, setDOB] = useState("");
  const [education, setEducation] = useState("");
  const [skills, setSkills] = useState("");
  const [errors, setErrors] = useState({});

  const validateForm = () => {
    let errors = {};
    let isValid = true;

    if (!firstName.trim()) {
      errors.firstName = "First name is required";
      isValid = false;
    }

    // ... (rest of the validation logic)

    setErrors(errors);
    return isValid;
  };

  const handleRegistration = (e) => {
    e.preventDefault();
    if (validateForm()) {
      const registrationData = {
        first_name: firstName,
        last_name: lastName,
        email,
        pass: password,
        contact,
        address,
        DOB: dob,
        Educational_Background: education,
        skills,
      };
      console.log("Registration Data:", registrationData);
      // Add logic to submit data to the server
    }
  };

  return (
    <div
      style={{ backgroundColor: "rgb(213, 226, 247)" }}
      className="login template d-flex justify-content-center align-items-center vh-100"
    >
      <div className="form p-5 rounded bg-white">
        {/* <form onSubmit={handleRegistration}>
          <div className="inputs">
            <h4 className="text-center">Enter Details</h4>
            <div className="input">
              <input
                type="text"
                className="form-control"
                placeholder="First Name"
                value={firstName}
                onChange={(e) => setFirstName(e.target.value)}
              />
              {errors.firstName && (
                <span className="error">{errors.firstName}</span>
              )}
            </div>
            <div className="input">
              <input
                type="text"
                className="form-control"
                placeholder="Last Name"
                value={lastName}
                onChange={(e) => setLastName(e.target.value)}
              />
              {errors.lastName && (
                <span className="error">{errors.lastName}</span>
              )}
            </div>

              <div className="input mb-3">
                <input
                  type="email"
                  className="form-control"
                  placeholder="Email Id"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                />
                {errors.email && <span className="error">{errors.email}</span>}
              </div>
              <div className="input mb-3">
                <input
                  type="text"
                  className="form-control"
                  placeholder="Contact"
                  value={contact}
                  onChange={(e) => setContact(e.target.value)}
                />
                {errors.contact && (
                  <span className="error">{errors.contact}</span>
                )}
              </div>
              <div className="input mb-3">
                <input
                  type="date"
                  className="form-control"
                  placeholder="Date of Birth"
                  value={dob}
                  onChange={(e) => setDOB(e.target.value)}
                />
              </div>
              <div className="input mb-3">
                <input
                  type="number"
                  className="form-control"
                  placeholder="Enter your age"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                />
                {errors.password && (
                  <span className="error">{errors.password}</span>
                )}
              </div>
            
          </div>
          <div className="submit-container">
            <button type="submit" className="btn btn-primary">
              Sign Up
            </button>
            <button type="button" className="btn btn-secondary">
              Log In
            </button>
          </div>
        </form> */}
        <form onSubmit={handleRegistration} className="container mt-5">
          <div className="inputs">
            <h4 className="text-center mb-4">Enter Details</h4>

            <div className="mb-3">
              <input
                type="text"
                className="form-control"
                placeholder="First Name"
                value={firstName}
                onChange={(e) => setFirstName(e.target.value)}
              />
              {errors.firstName && (
                <span className="error">{errors.firstName}</span>
              )}
            </div>

            <div className="mb-3">
              <input
                type="text"
                className="form-control"
                placeholder="Last Name"
                value={lastName}
                onChange={(e) => setLastName(e.target.value)}
              />
              {errors.lastName && (
                <span className="error">{errors.lastName}</span>
              )}
            </div>

            <div className="mb-3">
              <input
                type="email"
                className="form-control"
                placeholder="Email Id"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
              {errors.email && <span className="error">{errors.email}</span>}
            </div>

            <div className="mb-3">
              <input
                type="text"
                className="form-control"
                placeholder="Contact"
                value={contact}
                onChange={(e) => setContact(e.target.value)}
              />
              {errors.contact && (
                <span className="error">{errors.contact}</span>
              )}
            </div>

            <div className="mb-3">
              <input
                type="date"
                className="form-control"
                placeholder="Date of Birth"
                value={dob}
                onChange={(e) => setDOB(e.target.value)}
              />
            </div>

            <div className="mb-3">
              <input
                type="number"
                className="form-control"
                placeholder="Enter your age"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
              {errors.password && (
                <span className="error">{errors.password}</span>
              )}
            </div>

          </div>

          <div className="submit-container">
            <button type="submit" className="btn btn-primary">
              Sign Up
            </button>

            <button type="button" className="btn btn-secondary">
              Log In
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default SignupForm;
