import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:manager_house_fontend/core/config/assets/AppVectors.dart';
import 'package:manager_house_fontend/core/config/assets/app_images.dart';
import 'package:manager_house_fontend/presentation/intro/pages/get_started.dart';

class SplashPage extends StatefulWidget {
  const SplashPage({super.key});

  @override
  State<SplashPage> createState()=>_SplashPageState();
}

class _SplashPageState extends State<SplashPage> {
  @override
  void initState() {
    super.initState();
    redirect();
  }


  @override
  Widget build(BuildContext context) {
    return  Scaffold(
        body: Center(
        child:Image.asset(AppImages.logo)
        ),
    );
  }
Future<void> redirect()async{
    await Future.delayed(const Duration(seconds: 10));
    Navigator.pushReplacement(context, MaterialPageRoute(
        builder: (BuildContext context)=>  GetStartedPage()
    ));
}

}