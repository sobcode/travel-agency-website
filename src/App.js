import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import RootLayout from './pages/Root';
import ErrorPage from './pages/Error';
import Main from './pages/Main';
import Tours from './pages/Tours';
import Tour from './pages/Tour';
import AuthPage from './pages/Auth';
import logo from './logo.svg';
import ServicesPage from './pages/Services';
import BlogPage from './pages/Blog';
import {action as logoutAction} from './pages/Logout';
import { tokenLoader, checkAuthLoader } from './utils/auth';
import './App.css';

const router = createBrowserRouter([
  {
    path: '/',
    element: <RootLayout/>,
    errorElement: <ErrorPage/>,
    id: 'root',
    loader: tokenLoader,
    children: [
      {
        index: true,
        element: <Main/>,
        // loader: toursLoader
      },
      {
        path: 'tours',
        children: [
          {
            index: true,
            element: <Tours/>,
            //loader: toursLoader
          },
          {
            path: ':tourId',
            element: <Tour/>,
            // loader: tourLoader,
          }
        ]
      },
      {
        path: 'services',
        element: <ServicesPage/>,
        loader: checkAuthLoader,
      },
      {
        path: 'blog',
        element: <BlogPage/>,
        loader: checkAuthLoader,
      }
    ]
  },
  {
    path: 'auth',
    element: <AuthPage/>,
    // action: authAction,
  },
  {
    path: 'logout',
    action: logoutAction,
  }
])

function App() {
  return <RouterProvider router={router}/>
}

export default App;
