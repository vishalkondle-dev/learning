import React from "react";
import India from "./India";
import { Provider } from "react-redux";
import { store } from "./store";

const ReduxToolkit = () => {
  return (
    <div>
      <h1>ReduxToolkit</h1>
      <Provider store={store}>
        <India />
      </Provider>
    </div>
  );
};

export default ReduxToolkit;
