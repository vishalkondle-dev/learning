import React, { useEffect, useState } from "react";

const withLoading = (WrappedComponent: any) => {
  return function WithLoadingComponent(props: any) {
    // Some logic here
    const [loading, setLoading] = useState(false);
    const [data, setData] = useState<any>(null);

    useEffect(() => {
      // Simulate loading data
      setLoading(true);
      const timer = setTimeout(() => {
        setLoading(false);
        setData({ name: "John Doe" });
      }, 2000);

      return () => clearTimeout(timer);
    }, []);
    return (
      <div>
        <h1>withLoading</h1>
        <WrappedComponent {...props} loading={loading} data={data} />
      </div>
    );
  };
};

export default withLoading;
