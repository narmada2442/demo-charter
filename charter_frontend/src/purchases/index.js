import React from 'react';
import {
    BrowserRouter,
    Switch,
    Route,
    Link,
    Routes,
    Router
} from "react-router-dom";
import Home from './home';
import User from './user';
const Pages = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home />} exact={true} />
                <Route path="/user" element={<User />} exact={true} />
            </Routes>

        </BrowserRouter>
    );
};
export default Pages;