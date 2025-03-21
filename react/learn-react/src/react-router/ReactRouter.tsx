import React from "react";
import { createBrowserRouter, RouterProvider } from "react-router";
import Home from "./Home";
import Users from "./Users";
import User from "./User";
import UserTodos from "./UserTodos";

const ReactRouter = () => {
  const router = createBrowserRouter([
    { path: "/", element: <Home /> },
    { path: "/users", element: <Users /> },
    {
      path: "/users/:id",
      element: <User />,
    },
    {
      path: "/users/:id/todos",
      element: <UserTodos />,
    },
  ]);
  return (
    <div>
      <RouterProvider router={router} />
    </div>
  );
};

export default ReactRouter;
