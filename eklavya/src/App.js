import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Home/Navbar';
import Info from './Components/Home/Info';
import Feedback from './Components/Home/Feedback';
import Footer from './Components/Home/Footer';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Info />
      <Feedback />
      <Footer />
    </div>
  );
}

export default App;
