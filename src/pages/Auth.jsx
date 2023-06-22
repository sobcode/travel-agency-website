import { json, redirect } from "react-router-dom";
import AuthForm from "../components/AuthForm";

const AuthPage = () => {
  return (
    <>
        <AuthForm/>
    </>
  )
};

export default AuthPage;

// export const action = async ({request}) => {
//     const searchParams = new URL(request.url).searchParams;
//     const mode = searchParams.get('mode') || 'login';

//     if(mode !== 'login' && mode !== 'signup') {
//         throw json({message: 'Unsupported mode!'}, {status: 422});
//     }

//     const data = request.formData();
//     const authData = {
//         email: data.get('email'),
//         password: data.get('password'),
//     };

//     const response = await fetch(`http://localhost:8080/${mode}`, {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'Application\json',
//         },
//         body: JSON.stringify(authData),
//     });

//     //then we need to check response to status and if its ok

//     //if all good we have to set token in localstorage

//     return redirect('/');
// }