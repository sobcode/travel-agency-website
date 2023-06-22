import { useParams, json, useLoaderData } from 'react-router-dom';
import Navigation from '../components/Navigation';
import TourHeader from '../components/TourHeader';
import TourSection1 from '../components/TourSection1';
import TourSection2 from '../components/TourSection2';
import TourSection3 from '../components/TourSection3';
import TourBookingSection from '../components/TourBookingSection';
import Footer from '../components/Footer';
import './Tour.css';

const DUMMY_TOUR =  {
  title: 'Trip in Kyiv City',
  destination: 'Kyiv',
  durability: 5,
  rating: 4.9,
  id: 't2',
  price: 600,
  image: 'https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Ftour&psig=AOvVaw2A6dPF6BcTwc_Zv4ze5DX2&ust=1687272376010000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJjYwMjJz_8CFQAAAAAdAAAAABAD',
};

const Tour = () => {
  const {tourId} = useParams();
  // const tour = useLoaderData();
  return (
    <div>
        <TourHeader tour={DUMMY_TOUR}/>
        <TourSection1/>
        <TourSection2/>
        <TourSection3/>
        <TourBookingSection/>
        <Footer/>
    </div>
  )
}

export default Tour;

// export const loader = async (params, request) => {
//   const id = params.tourId;
//   const response = await fetch('http://localhost:8080/tours/' + id);

//   if (!response.ok) {
//     throw json(
//       { message: 'Could not fetch details for selected tour.' },
//       {
//         status: 500,
//       }
//     );
//   } else {
//     const resData = await response.json();
//     return resData.tour;
//   }
// }