import React, { useState } from "react";

const StudentRegistrationForm = () => {
  const [formData, setFormData] = useState({
    first_name: "",
    last_name: "",
    email: "",
    country: "",
    contact_no: "",
    state: "",
    city: "",
    aadhar_no: "",
    dob: "",
    age: "",
    address: "",
    gender: "",
    password: "",
  });

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData); // Replace this with your logic for submitting data
  };

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  return (
    <div className="container mt-5">
      <h2 className="mb-4">Student Registration Form</h2>
      <form onSubmit={handleSubmit}>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formFirstName" className="form-label">
              First Name
            </label>
            <input
              type="text"
              className="form-control"
              id="formFirstName"
              name="first_name"
              value={formData.first_name}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formLastName" className="form-label">
              Last Name
            </label>
            <input
              type="text"
              className="form-control"
              id="formLastName"
              name="last_name"
              value={formData.last_name}
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formEmail" className="form-label">
              Email
            </label>
            <input
              type="email"
              className="form-control"
              id="formEmail"
              name="email"
              value={formData.email}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formCountry" className="form-label">
              Country
            </label>
            <input
              type="text"
              className="form-control"
              id="formCountry"
              name="country"
              value={formData.country}
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formContactNo" className="form-label">
              Contact Number
            </label>
            <input
              type="text"
              className="form-control"
              id="formContactNo"
              name="contact_no"
              value={formData.contact_no}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formState" className="form-label">
              State
            </label>
            <input
              type="text"
              className="form-control"
              id="formState"
              name="state"
              value={formData.state}
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formCity" className="form-label">
              City
            </label>
            <input
              type="text"
              className="form-control"
              id="formCity"
              name="city"
              value={formData.city}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formAadharNo" className="form-label">
              Aadhar Number
            </label>
            <input
              type="text"
              className="form-control"
              id="formAadharNo"
              name="aadhar_no"
              value={formData.aadhar_no}
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formDob" className="form-label">
              Date of Birth
            </label>
            <input
              type="date"
              className="form-control"
              id="formDob"
              name="dob"
              value={formData.dob}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formAge" className="form-label">
              Age
            </label>
            <input
              type="text"
              className="form-control"
              id="formAge"
              name="age"
              value={formData.age}
              onChange={handleChange}
            />
          </div>
        </div>
        <div className="row mb-3">
          <div className="col">
            <label htmlFor="formAddress" className="form-label">
              Address
            </label>
            <input
              type="text"
              className="form-control"
              id="formAddress"
              name="address"
              value={formData.address}
              onChange={handleChange}
            />
          </div>
          <div className="col">
            <label htmlFor="formGender" className="form-label">
              Gender
            </label>
            <select
              className="form-select"
              id="formGender"
              name="gender"
              value={formData.gender}
              onChange={handleChange}
            >
              <option value="Male">Male</option>
              <option value="Female">Female</option>
              <option value="Other">Other</option>
            </select>
          </div>
        </div>
        <button type="submit" className="btn btn-primary">
          Submit
        </button>
      </form>
    </div>
  );
};

export default StudentRegistrationForm;
