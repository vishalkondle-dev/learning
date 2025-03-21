import React from "react";
import useFetch from "../hooks/CustomHooks/useFetch";
import { NavLink } from "react-router";

const Users = () => {
  const [users] = useFetch("https://jsonplaceholder.typicode.com/users");
  return (
    <div>
      <div style={{ display: "flex", flexDirection: "row", gap: "10px" }}>
        <NavLink
          to="/"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          Home
        </NavLink>
        <NavLink
          to="/users"
          className={({ isActive }) => (isActive ? "active" : "")}
        >
          Users
        </NavLink>
      </div>
      <ul>
        {users?.map((user) => (
          <NavLink to={`/users/${user.id}`} key={user.id}>
            <li>{user.name}</li>
          </NavLink>
        ))}
      </ul>
    </div>
  );
};

export default Users;
