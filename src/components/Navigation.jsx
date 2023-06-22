import { NavLink, Link, useRouteLoaderData, Form } from "react-router-dom";
import logo from "../assets/img/logo.svg";
import logIcon from "../assets/img/log-out.svg";
import "../pages/Main.css";
const Navigation = () => {
  const token = useRouteLoaderData('root');
  return (
    <nav className="header__nav">
      <div className="header__nav__logo">
        <Link>
          <img src={logo} alt="logoipsum" />
        </Link>
      </div>
      <ul className="header__nav__list">
        <li>
          <NavLink to="/" className={({ isActive }) => (isActive ? "active" : undefined)} end>
            Home
          </NavLink>
        </li>
        <li>
          <NavLink to="/tours" className={({ isActive }) => (isActive ? "active" : undefined)} end>
            Tours & Voyages
          </NavLink>
        </li>
        <li>
          <NavLink to="/services" className={({ isActive }) => (isActive ? "active" : undefined)} end>
            Services
          </NavLink>
        </li>
        <li>
          <NavLink to="/blog" className={({ isActive }) => (isActive ? "active" : undefined)} end>
            Blog
          </NavLink>
        </li>
      </ul>
      <div className="header__nav__actions">
        {!token && <Link to="/auth">
          <button className="actions__login-btn">
            Log In <img src={logIcon} alt="log out" />
          </button>
        </Link>}
        {token && <Form action="/logout">
          <button className="actions__login-btn">
            Log Out <img src={logIcon} alt="log out" />
          </button>
        </Form>}
      </div>
    </nav>
  );
};

export default Navigation;
