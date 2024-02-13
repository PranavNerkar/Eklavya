import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./Components/Home/Home";
import TutorForm from "./Components/Home/RegisterTutor";

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/tutor-form" element={<TutorForm/>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
