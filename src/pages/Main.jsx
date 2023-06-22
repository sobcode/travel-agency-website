import { useLoaderData } from 'react-router-dom';
import MainHeader from '../components/MainHeader';
import MainSection1 from '../components/MainSection1';
import MainSection2 from '../components/MainSection2';
import MainSection3 from '../components/MainSection3';
import MainSection4 from '../components/MainSection4';
import MainSection5 from '../components/MainSection5';
import MainSection6 from '../components/MainSection6';
import MainSection7 from '../components/MainSection7';
import Footer from '../components/Footer';
import './Main.css';

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

function Main() {
  const tours = useLoaderData();
  return (
    <div>
        <MainHeader/>
        <MainSection1/>
        <MainSection2/>
        <MainSection3 tours={DUMMY_TOURS}/>
        <MainSection4/>
        <MainSection5/>
        <MainSection6/>
        <MainSection7/>
        <Footer/>
    </div>
  )
}

export default Main