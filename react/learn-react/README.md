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

#### useContext

```tsx
const MyContext = createContext(intialValue);
const value = useContext(MyContext);
```

- createContext : It will create a context object.
- useContext : It will return the value of the context object.
- MyContext.Provider :
  - We need to provide the intial value to the context object.
  - We need to wrap this as a provider to the component which needs the context object.
- value : It will return the value of the context object.

#### useRef

```tsx
const ref = useRef(initialValue);
```

- useRef : It will create a ref object.
- ref.current : It will return the value of the ref object.
- initialValue : It will set the initial value of the ref object.
- The ref object is a mutable value.
- with that ref object we can access the DOM element.
- when this ref object is updated, the component will not re-render.

#### useReducer

```tsx
const [state, dispatch] = useReducer(reducer, initialState);
```

- useReducer : It will create a state object and a dispatch function.
- reducer : It will be a function which will update the state object.
- initialState : It will be the initial state of the state object.
- dispatch
  - It will be the function which will update the state object.
  - The dispatch function is a pure function that accepts a function as an argument.
  - The function is called with the current state as an argument.
  - The function should return the new state.
  - The state object is immutable.
- State will be predicted state object.

#### useCallback

```tsx
const memoizedFunction = useCallback(() => {
  // Do something
}, [dependencies]);
```

- useCallback : It will memorize function.
- It will not be re-created on every render, instead it will be memoized and will only be re-created when the dependencies change.
- It will return a memoized function.

#### useMemo

```tsx
const memoizedValue = useMemo(() => {
  // Do something
}, [dependencies]);
```

- useMemo : It will memoize value.
- It will not be re-ran on every render, instead it will be memoized and will only be re-ran when the dependencies change.

## React Router

```tsx
const router = createBrowserRouter([
  { path: "/", element: <Home /> },
])
<RouterProvider router={router} />
```

- createBrowserRouter : It will create a router object.
- RouterProvider : It will render the router object.
- path : It will be the path of the route.
- element : It will be the element of the route. It can be JSX also.
- Link : It will be the link to the route
- NavLink : It will also be the link to the route with active class.
- useParams : It will return the parameters of the route.
- useNavigate : It will navigate to the route.
- useLocation : It will return the location object.
- useSearchParams : It will return the search params object.

## Redux Toolkit

```tsx
const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
});

const counter = useSelector((state) => state.counter);
const dispatch = useDispatch();

dispatch(increment());
```

- configureStore : It will create a store object.
- reducer : It will be the reducer object.
- useSelector : It will return the value of the store object.
- useDispatch : It will return the dispatch function.
- increment : It will increment the value of the store object.
- createSlice : It will create a slice object, which will be used to create a reducer object.
- createAsyncThunk : It will create a async thunk object, which will be used to create a async action object.
- <Provider store={store}>{children}<Provider> : It will provide the store object to the component. It will be used to access the store object in the component.
