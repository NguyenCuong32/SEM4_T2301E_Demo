import 'package:flutter/material.dart';

class Setting extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
  return Scaffold(
    appBar: AppBar(
      title: Text("Setting Page"),
    ),
    body: Center(
      child: Column(
        children: [
          Text("Setting some properties"),
          TextButton(onPressed: ()=>{
            print("Seting notitfication")
          }, child: Text("Seting Notification"))
        ],
      ),

    ),
  );
  }

}