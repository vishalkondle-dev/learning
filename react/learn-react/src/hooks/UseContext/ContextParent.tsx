import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";
import ContextChild from "./ContextChild";

const ContextParent = () => {
  const themeContext = useContext(ThemeContext);
  return (
    <div
      style={{
        background: themeContext.theme,
        border: `1px solid ${themeContext.color}`,
        padding: "40px",
      }}
    >
      <h1 style={{ color: themeContext.color }}>ContextParent</h1>
      <ContextChild />
    </div>
  );
};

export default ContextParent;
