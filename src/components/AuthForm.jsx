import { Form, Link, useSearchParams, useNavigation } from "react-router-dom";
import './AuthForm.css';

const AuthForm = () => {
    const [searchParams] = useSearchParams();
    const nav = useNavigation();
    const isLogin = searchParams.get('mode') === 'login';
    const isSubmitting = nav.state === 'submitting';

  return (
    <div className="auth-form-wrapper">
      <Form className="auth-form">
        <h1>{isLogin ? 'Log in' : 'Sign up'}</h1>
        <p>
          <label htmlFor="email">Email</label>
          <input id="email" type="email" name="email" required />
        </p>
        <p>
          <label htmlFor="password">Password</label>
          <input id="password" type="password" name="password" required />
        </p>
        <div className='actions'>
          <Link to={`?mode=${isLogin ? 'signup' : 'login'}`}>
            {isLogin ? 'Sign up' : 'Log in'}
          </Link>
          <button disabled={isSubmitting}>{isSubmitting ? 'Submitting...' : 'Save'}</button>
        </div>
      </Form>
    </div>
  );
};

export default AuthForm;
