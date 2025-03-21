import React from "react";
import MyComponent from "./MyComponent";
import withLoading from "./withLoading";

const HigherOrderComponent = () => {
  const EnhancedComponent = withLoading(MyComponent);
  return (
    <div>
      <h1>HigherOrderComponent</h1>
      <EnhancedComponent />
    </div>
  );
};

export default HigherOrderComponent;
