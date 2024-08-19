import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:manager_house_fontend/common/widgets/button/basic_app_button.dart';
import 'package:manager_house_fontend/core/config/assets/AppVectors.dart';
import 'package:manager_house_fontend/core/config/assets/app_images.dart';
import 'package:manager_house_fontend/presentation/homePages/home_page.dart';

class GetStartedPage extends StatelessWidget {
   GetStartedPage({super.key});

  final TextEditingController _email = TextEditingController();
  final TextEditingController _password = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Align(
            alignment: Alignment.center,
            child: Padding(
              padding: const EdgeInsets.symmetric(horizontal: 40),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Image.asset(AppImages.logo),
                  const SizedBox(height: 55),
                  _emailField(context),
                  const SizedBox(
                    height: 20,
                  ),
                  _passwordField(context),
                  const SizedBox(
                    height: 20,
                  ),
                         BasicAppButton(
                            onPressed: () {
                              Navigator.push(
                                  context,
                                  MaterialPageRoute(
                                      builder: (BuildContext context) =>
                                          HomePage()));
                            },
                            title: "Login")
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

   Widget _emailField(BuildContext context) {
     return TextField(
       controller: _email,
       decoration: const InputDecoration(hintText: 'Enter Email')
           .applyDefaults(Theme.of(context).inputDecorationTheme),
     );
   }

   Widget _passwordField(BuildContext context) {
     return TextField(
       controller: _password,
       decoration: const InputDecoration(hintText: 'Password')
           .applyDefaults(Theme.of(context).inputDecorationTheme),
     );
   }

}
