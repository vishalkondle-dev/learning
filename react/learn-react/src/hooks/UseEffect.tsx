import React, { useEffect } from "react";

const UseEffect = ({ show }: { show: boolean }) => {
  useEffect(() => {
    console.log("onFirstRender");
  }, []);

  useEffect(() => {
    console.log("onEveryRender");
  });

  useEffect(() => {
    console.log("onShowChange");
  }, [show]);

  useEffect(() => {
    return () => {
      console.log("onComponentWillUnmount");
    };
  }, []);

  return (
    <div>
      <h1>UseEffect</h1>
    </div>
  );
};

export default UseEffect;
