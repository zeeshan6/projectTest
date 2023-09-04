/**
 * @format
 */

import {AppRegistry} from 'react-native';
import App from './App';
import {name as appName} from './app.json';
import Routes from './src/routes';

// const RootRouters = () => {
//   return <Routes />;
// };

AppRegistry.registerComponent(appName, () => App);
