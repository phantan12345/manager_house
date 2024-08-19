import 'package:flutter/material.dart';
import 'package:manager_house_fontend/core/config/theme/app_theme.dart';
import 'package:manager_house_fontend/presentation/splash/pages/splash.dart';


void main(){
runApp(const HouseApp());
}
class HouseApp extends StatelessWidget {
  const HouseApp({super.key});

  @override
  Widget build(BuildContext context) {
    return  MaterialApp(
      theme: AppTheme.lightTheme,
      debugShowCheckedModeBanner: false,
      home:  SplashPage(),
    );
   }
  }