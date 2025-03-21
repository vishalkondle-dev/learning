import React from "react";
import { NavLink } from "react-router";

const Home = () => {
  return (
    <div style={{ display: "flex", flexDirection: "row", gap: "10px" }}>
      <NavLink to="/" className={({ isActive }) => (isActive ? "active" : "")}>
        Home
      </NavLink>
      <NavLink
        to="/users"
        className={({ isActive }) => (isActive ? "active" : "")}
      >
        Users
      </NavLink>
    </div>
  );
};

export default Home;
