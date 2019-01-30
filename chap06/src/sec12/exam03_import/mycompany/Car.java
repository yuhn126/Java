package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hankook.Tire;		//어떤 패키지의 tire인지 구분하기 위해 import에 추가
import sec12.exam03_import.hyndai.*;
import sec12.exam03_import.kumho.*;
//자동 추가 : ctrl + shift + o


public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 = new Tire();			//어떤 패키지의 tire인지 구분하기 위해 import에 추가
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();	//import 필요x
}
