import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget{
  @override
  State<StatefulWidget> createState() => _HomePageState();
  
}
class _HomePageState extends State<HomePage>{
  @override
  Widget build(BuildContext context) {
   return Scaffold(
     body: Center(
       child: Text("Home Page"),
     )
   );
  }

}