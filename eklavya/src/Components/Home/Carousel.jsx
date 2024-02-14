import React from 'react';
import { Carousel } from 'react-bootstrap';
import firstImage from './../../Imges/u1.png';
import secondImage from './../../Imges/u2.jpg';
import thirdImage from './../../Imges/u3.png';
import fourthImage from './../../Imges/u8.png';
import fifthImage from './../../Imges/u5.png';

const CarouselComponent = () => {
  return (
    <div style={{ backgroundColor: 'grey' }}>
      <Carousel interval={5000}>
        <Carousel.Item style={{ backgroundColor: '#ac4da4' }}> {/* Set background color of first slide to white */}
          <img
            className="d-block w-100"
            src={firstImage}
            alt="First slide"
          />
          <Carousel.Caption>
            {/* <h3>First slide label</h3> */}
            <h1>Got a dream?</h1>
            <p><h3>We have thousands of real-world experts that can help. 
              Start learning the skills you need to make it happen.</h3></p>
            <p><h3>Our real-world experts can’t wait to share their experience to help you grow.</h3></p>
          </Carousel.Caption>
        </Carousel.Item>

        <Carousel.Item>
            
          <img
            className="d-block w-100"
            src={secondImage}
            alt="Second slide"
          />
          <Carousel.Caption>
            <h3>Learning that gets you</h3>
             <p>Skills for your present (and your future). Get started with us..</p>
          </Carousel.Caption>
        </Carousel.Item>

        <Carousel.Item>
              <img
            className="d-block w-100"
            src={thirdImage}
            alt="Third slide"
          />
          <Carousel.Caption>
            <h3>Third slide label</h3>
            <p>Skill up with the Leading Up podcast.</p>
          </Carousel.Caption>
        </Carousel.Item>

        <Carousel.Item>
          <img
            className="d-block w-100"
            src={fourthImage}
            alt="Fourth slide"
          />
          <Carousel.Caption>
            <h3>Fourth slide label</h3>
            <p>Education is good System, please Login.</p>
          </Carousel.Caption>
        </Carousel.Item>


        <Carousel.Item>
          <img
            className="d-block w-100"
            src={fifthImage}
            alt="Fifth slide"
          />
          <Carousel.Caption>

            <h3>Fifth slide label</h3>
            <p>Education is good System, please Login.</p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>
    </div>
  );
};

export default CarouselComponent;
