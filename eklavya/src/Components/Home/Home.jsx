import React, { useState } from "react";
import MyNavbar from "./Navbar";
import Info from "./Info";
import Feedback from "./Feedback";
import Footer from "./Footer";
import Login from "./Login";
import SignupForm from "./RegisterStudent";
import CarouselComponent from "./Carousel";
  
const Home = () => {
  const [showLogin, setShowLogin] = useState(false);
  const [showRegistration, setShowRegister] = useState(false);

  const handleLoginClick = () => {
    setShowRegister(false);
    setShowLogin(!showLogin);
  };

  const handleRegisterClick = () => {
    setShowLogin(false);
    setShowRegister(!showRegistration);
  };

  return (
    <div>
      <MyNavbar
        onLoginClick={handleLoginClick}
        onRegisterClick={handleRegisterClick}
      />
      {showLogin && <Login />}
      {showRegistration && <SignupForm />}

      {<Info />}
      {<CarouselComponent />}
      {<Feedback />}
      {<Footer />}
      

    </div>
  );
};

export default Home;