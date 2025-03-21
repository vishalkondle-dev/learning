# React

## Hooks

#### useState

```tsx
const [state, setState] = useState(initialState);
```

- Simple state object which will re-render the component on change.
- Returns an array with two values: the current state and a function to update it.
- The function is a pure function that accepts a function as an argument.
- The function is called with the current state as an argument.
- The function should return the new state.

#### useEffect

```tsx
useEffect(() => {
  // Do something

  return () => {
    // Cleanup
  };
}, [dependencies]);
```

- Runs a side effect in a function component after each render.
- Accepts a function as an argument.
- The function is called after each render.
- Accepts a second argument as an array of dependencies.
  - If the depedency array is empty, the function will run only on first render.
  - If the depedency array is passed with any value(s), the function will run on first render and every time the value(s) change.
  - If the second argument is not passed, the function will run on every render.
- Cleanup Function - It has the return function which is just before the component is unmounted.
