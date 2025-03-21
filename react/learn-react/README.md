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
