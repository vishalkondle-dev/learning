import { createContext } from "react";

const ThemeContext = createContext({
  theme: "black",
  color: "white",
});

export default ThemeContext;
