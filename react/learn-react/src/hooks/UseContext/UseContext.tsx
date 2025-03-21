import { useState } from "react";
import Parent from "./Parent";
import ThemeContext from "./ThemeContext";
import ContextParent from "./ContextParent";

function UseContext() {
  const [theme, setTheme] = useState("black");
  const color = theme === "black" ? "white" : "black";

  return (
    <div>
      <button
        onClick={() => setTheme(color)}
      >{`Change Theme to ${color}`}</button>
      <h1>Prop Driling</h1>
      <Parent theme={theme} color={color} />
      <hr />
      <h1>UseContext</h1>
      <ThemeContext.Provider value={{ theme, color }}>
        <ContextParent />
      </ThemeContext.Provider>
    </div>
  );
}

export default UseContext;
