// In App.js in a new project

import * as React from 'react';
import {View, Text} from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createNativeStackNavigator} from '@react-navigation/native-stack';
import Dashboard from '../screens/Dashboard';
import Map from '../screens/Map';
// import AnimatedSplash from 'react-native-animated-splash';

const Stack = createNativeStackNavigator();

// React.useEffect(() => {
//   //   AnimatedSplash.hide();
// }, []);

const Routes = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="dashboard" component={Dashboard} />
        <Stack.Screen name="map" component={Map} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default Routes;
