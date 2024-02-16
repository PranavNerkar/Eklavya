import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./Components/Home/Home";
import TutorForm from "./Components/Home/RegisterTutor";
import TeachPage from "./Components/Home/TeachPage";
import StudentHome from "./Components/Student/StudentHome";

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/tutor-form" element={<TutorForm/>} />
          <Route path="/teach" element={<TeachPage/>} />
          <Route path="/Student" element={<StudentHome />} />
        </Routes>
      </Router>
    </div>
  );
}
export default App;