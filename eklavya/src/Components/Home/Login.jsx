import React from "react";
import { useReducer, useState } from "react";
import { useNavigate } from "react-router-dom";

const init = {
  user_id: "",
  password: "",
};

const reducer = (state, action) => {
  switch (action.type) {
    case "update":
      return { ...state, [action.fld]: action.val };
    case "reset":
      return init;
  }
};

const Login = () => {
  const navigate = useNavigate();

  const [info, dispatch] = useReducer(reducer, init);
  const [msg, setMsg] = useState(1);
  const [flag, setFlag] = useState(false);

  const setMessage = () => {
    if (msg == -1) {
      return "Check Details";
    } else {
      return "";
    }
  };

  const submitData = (e) => {
    e.preventDefault();
    setFlag(true);
    
    const reqOption = {
      method: "post",
      headers: { "content-type": "application/json" },
      body: JSON.stringify({
        user_id: info.user_id,
        password: info.password,
      }),
    };

    fetch("http://localhost:8080/login", reqOption)
      .then((resp) => resp.json())
      .then((data) => {
        var v = data.user_name ;
        if(data.role.role_id == 1) {
          navigate("/Student"+v);
        }
        else if(data.role.role_id == 2) {
          navigate("/Tutor"+v);
        }
        else if(data.role.role_id == 3){
          navigate("/Admin"+v);
        }else{
          setFlag(true) ;
          msg = -1;
        }
      });
  };
  return (
    <div
      style={{ backgroundColor: "rgb(213, 226, 247)" }}
      className="login template d-flex justify-content-center align-items-center vh-100"
    >
      <div className="form p-5 rounded bg-white">
        <form>
          <h3 className="text-center">Login</h3>
          <div className="mb-2">
            <label htmlFor="email">Email</label>
            <input
              type="email"
              placeholder="Enter Email"
              name="user_id"
              className="form-control mb-2"
              value={info.user_id}
              onChange={(e) => {
                dispatch({
                  type: "update",
                  fld: "user_id",
                  val: e.target.value,
                });
              }}
            />
          </div>

          <div className="mb-2">
            <label htmlFor="password">Password</label>
            <input
              id="pwd"
              type="password"
              name="pwd"
              placeholder="Enter Password"
              className="form-control mb-2"
              value={info.password}
              onChange={(e) => {
                dispatch({
                  type: "update",
                  fld: "password",
                  val: e.target.value,
                });
              }}
            />
          </div>

          <div className="mb-2">
            <input
              type="checkbox"
              className="custom-control custom-checkbox"
              id="check"
            />
            <label htmlFor="check" className="custom-input-label ms-2">
              Remember Me
            </label>

            <a href=""></a>
          </div>

          <div
            style={{ display: flag ? "block" : "none", color: "red" }}
            className="mb-2"
          >
            <p>{setMessage()}</p>
          </div>

          <div className="d-flex">
            <input
              type="submit"
              value="Log In"
              className="btn btn-primary"
              onClick={(e) => {
                submitData(e);
              }}
            />
            <input
              type="reset"
              value="Reset"
              className="btn btn-danger"
              onClick={(e) => {
                setFlag(false);
                dispatch({
                  type: "reset",
                });
              }}
            />
          </div>

          <div className="mt-2">
            <label htmlFor="">Forget : </label>
            <a href=""> Password? </a>
          </div>
          <div className="">
            <label htmlFor="">New User : </label>
            <a href=""> Sign Up </a>
          </div>
        </form>
      </div>
    </div>
  );
};

export default Login;
