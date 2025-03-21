// Define a component to be enhanced (functional component)
const MyComponent = ({ loading, data }: { loading: boolean; data: any }) => (
  <div>
    {loading ? <p>Loading...</p> : <code>{JSON.stringify(data, null, 2)}</code>}
  </div>
);

export default MyComponent;
