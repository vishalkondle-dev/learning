import WithoutUseCallback from "./WithoutUseCallback";
import WithUseCallback from "./WithUseCallback";

function UseCallback() {
  return (
    <div>
      <h1>Without UseCallback</h1>
      <WithoutUseCallback />
      <hr />
      <h1>With UseCallback</h1>
      <WithUseCallback />
    </div>
  );
}

export default UseCallback;
