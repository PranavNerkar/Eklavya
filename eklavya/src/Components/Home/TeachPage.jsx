// import React from 'react';
// // import img from './../../Imges/u9.jpg'; // Import the /image file
// import img from '../../Imges/u9.jpg';

// const TeachPage = () => {
//   return (
//     <div>

//       <h1>Teach on Eklavya</h1>
//        <div> <h1>Come teach with us</h1>
//              <h3>Become an instructor and change lives — including your own</h3>
//         </div>
//       <img src={img} alt="Teach on Eklavya" />
//       <p>This is the page where you can teach on Eklavya.</p>
//     </div>
//   );
// };

// export default TeachPage;


// import React from 'react';
// import img from '../../Imges/u9.jpg';

// const TeachPage = () => {
//   return (
//     <div className="container">
//       <div className="row">
//         <div className="col-md-6">
//           <h1>Teach on Eklavya</h1>
//           <div>
//             <h1>Come teach with us</h1>
//             <h3>Become an instructor and change lives — including your own</h3>
//           </div>
//           <p>This is the page where you can teach on Eklavya.</p>
//         </div>
//         <div className="col-md-6">
//           <img src={img} alt="Teach on Eklavya" />
//         </div>
//       </div>
//     </div>
//   );
// };

// export default TeachPage;


import React from 'react';
import img from '../../Imges/u9.jpg';

const TeachPage = () => {
  return (
    <div style={{ position: 'relative' }}>
      <img src={img} alt="Teach on Eklavya" style={{ width: '100%' }} />
      <div style={{ position: 'absolute', bottom: 0, left: 0, backgroundColor: 'rgba(0, 0, 0, 0.5)', padding: '20px' }}>
        <h1>Come teach with us</h1>
        <h3>Become an instructor and change lives — including your own</h3>
      </div>
    </div>
  );
};

export default TeachPage;
    