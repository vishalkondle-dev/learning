import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

const ContextChild = () => {
  const { color, theme } = useContext(ThemeContext);
  return (
    <div
      style={{
        background: theme,
        border: `1px solid ${color}`,
        padding: "40px",
      }}
    >
      <h1 style={{ color }}>ContextChild</h1>
    </div>
  );
};

export default ContextChild;
