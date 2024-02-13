import React from "react";
import { Link } from "react-router-dom";

const Register = () => {
  return (
    <div className="container mt-5">
      <div className="d-flex justify-content-center">
        <div className="btn-group ml-2" role="group" >
          <a href="/register/tutor" className="primary">
            Tutor
          </a>
        </div>
        <div className="btn-group" role="group">
          <a href="/register/student" className="primary">
            Student
          </a>
        </div>
      </div>
    </div>
  );
};

export default Register;
