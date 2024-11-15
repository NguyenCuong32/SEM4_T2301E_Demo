import 'dart:convert';

import 'package:tourist/commons/commondefine.dart';
import 'package:tourist/models/tour.dart';
import 'package:http/http.dart' as http;

class RestfulService {
  Future<List<Tour>> getTours() async {
    List<Tour> tours = [];
    try {
      final response = await http.get(Uri.parse(CommonDefine.TOUR));
      if (response.statusCode ==200){
        tours = parserTours(response.body);
        return tours;
      }
      else{
        print(response.statusCode);
        return tours;
      }
    } catch (e) {
      return tours;
    }
  }
  List<Tour> parserTours(String jsonContent) {
    List<dynamic> jsonList = jsonDecode(jsonContent);
    List<Tour> products = [];
    for (var jsonTour in jsonList) {
      products.add(Tour.fromJson(jsonTour));
    }
    return products;
  }
}
