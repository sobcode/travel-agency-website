import { json, useLoaderData } from 'react-router-dom';
import Navigation from '../components/Navigation'
import ToursHeader from '../components/ToursHeader';
import ToursList from '../components/ToursList';
import Footer from '../components/Footer';
import '../pages/Main.css';

const DUMMY_TOURS = [
  {
    title: 'Trip in Dubai City',
    destination: 'Dubai',
    durability: 7,
    rating: 4.8,
    id: 't1',
    price: 1200,
  },
  {
    title: 'Trip in Kyiv City',
    destination: 'Kyiv',
    durability: 5,
    rating: 4.9,
    id: 't2',
    price: 600,
    image: 'https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Ftour&psig=AOvVaw2A6dPF6BcTwc_Zv4ze5DX2&ust=1687272376010000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJjYwMjJz_8CFQAAAAAdAAAAABAD',
  }
];


const Tours = () => {
  // const tours = useLoaderData();

  return (
    <div>
        <ToursHeader/>
        <ToursList tours={DUMMY_TOURS}/>
        <Footer/>
    </div>
  )
}

export default Tours;

export const loader = async (params, request) => {
  const response = await fetch('http://localhost:8080/tours');

  if (!response.ok) {
    throw json(
      { message: 'Could not fetch tours.' },
      {
        status: 500,
      }
    );
  } else {
    const resData = await response.json();
    return resData.tours;
  }
}