import React from 'react'

export default function LoggedOut() {
  return (
    <div>
        <ul className="navbar-nav ms-auto py-4 py-lg-0">
            <li class="nav-item">
                <a class="nav-link" href="#!"
                data-bs-toggle="modal" data-bs-target="#registerModal">Sign Up</a></li>
            
            <li class="nav-item"><a class="nav-link" href="#!"
                data-bs-toggle="modal" data-bs-target="#loginModal">Log In</a></li>
        </ul>
    </div>
  )
}
