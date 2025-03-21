import React from "react";

const Child = ({ theme }: { theme: string }) => {
  const color = theme === "black" ? "white" : "black";
  return (
    <div
      style={{
        background: theme,
        border: `1px solid ${color}`,
        padding: "40px",
      }}
    >
      <h1 style={{ color }}>Child</h1>
    </div>
  );
};

export default Child;
