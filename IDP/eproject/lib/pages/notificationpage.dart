import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class NotificationPage extends StatefulWidget{
  @override
  State<StatefulWidget> createState() =>_NotificationState();

}
class _NotificationState extends State<NotificationPage>{
  @override
  Widget build(BuildContext context) {
   return Scaffold(
     body: Center(
       child: Text("Notification"),
     ),
   );
  }

}