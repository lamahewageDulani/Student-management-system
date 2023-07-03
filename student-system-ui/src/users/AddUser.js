import React from 'react';
// import ViewUser from './ViewUser';
import { useState } from 'react';
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';


export default function AddUser() {

  let navigate = useNavigate()
  
  const [user, setUser] = useState({
    name:"",
    username:"",
    email:""
  })

  const{name, username, email} = user

  const onInputChange = (e) => {
    setUser({ ...user, [e.target.name]:e.target.value})
  };

  const onSubmit = async (e) => {
    e.preventDefault();
    await axios.post("http://localhost:8080/user", user)
    navigate("/");
  }

  return (
    <div className='contain'>
      <div className='row'>
        <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
          <h2 className='text-center m-4'>Registered User</h2>
          
          <form onSubmit={(e) => onSubmit(e)}>
          <div className='mb-3'>
            <label htmlFor='name' className='form-label'>
              Name
            </label>
            <input
              type='text'
              className='form-control'
              placeholder='Enter your name'
              name='name'
              id='name'
              value={name}
              onChange = {(e) => onInputChange(e)}
              >
            </input>
          </div>
          <div className='mb-3'>
            <label htmlFor='username' className='form-label'>
              User Name
            </label>
            <input
              type='text'
              className='form-control'
              placeholder='Enter the username'
              name='username'
              id='username'
              value={username}
              onChange = {(e) => onInputChange(e)}
              >
            </input>
          </div>
          <div className='mb-3'>
            <label htmlFor='email' className='form-label'>
              Email
            </label>
              <input
                type='text'
                className='form-control'
                placeholder='Enter the email'
                name='email'
                id='email'
                value={email}
                onChange = {(e) => onInputChange(e)}
                >
              </input>
          </div>
          <button type='submit' className='btn btn-outline-primary'>
            Submit
          </button>
          <Link className='btn btn-outline-danger mx-2' to="/">
            Cancel
          </Link>
          </form>
        </div>  
      </div>     
    </div>
  )
}
