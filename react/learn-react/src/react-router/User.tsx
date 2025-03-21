import React from "react";
import useFetch from "../hooks/CustomHooks/useFetch";
import { Outlet, useNavigate, useParams } from "react-router";

const User = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [user] = useFetch(`https://jsonplaceholder.typicode.com/users/${id}`);

  if (!user) return <div>Loading...</div>;

  return (
    <div style={{ textAlign: "left" }}>
      <button onClick={() => navigate("/users")}>Back</button>
      <button onClick={() => navigate(`/users/${id}/todos`)}>Todos</button>
      <code>
        <pre>{JSON.stringify(user, null, 2)}</pre>
      </code>
      <Outlet />
    </div>
  );
};

export default User;
