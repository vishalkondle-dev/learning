import React from "react";
import WithUseMemo from "./WithUseMemo";
import WithoutUseMemo from "./WithoutUseMemo";

const UseMemo = () => {
  return (
    <div>
      <h1>UseMemo</h1>
      <h1>Without UseMemo</h1>
      <WithoutUseMemo />
      <hr />
      <h1>With UseMemo</h1>
      <WithUseMemo />
    </div>
  );
};

export default UseMemo;
