import useFetch from "./useFetch";

function CustomHooks() {
  const fetch = useFetch("https://jsonplaceholder.typicode.com/posts");
  return (
    <div>
      <h1>Custom Hooks - useFetch</h1>
      <h1>{fetch[0]?.length} Posts</h1>
    </div>
  );
}

export default CustomHooks;
