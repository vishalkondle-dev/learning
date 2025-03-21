import React from "react";
import useFetch from "../hooks/CustomHooks/useFetch";
import { useNavigate, useParams } from "react-router";

const UserTodos = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [todos] = useFetch(
    `https://jsonplaceholder.typicode.com/users/${id}/todos`
  );

  if (!todos) return <div>Loading...</div>;

  return (
    <div style={{ textAlign: "left" }}>
      <button onClick={() => navigate(-1)}>Back</button>
      <code>
        <pre>{JSON.stringify(todos, null, 2)}</pre>
      </code>
    </div>
  );
};

export default UserTodos;
