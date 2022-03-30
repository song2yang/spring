package sou;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName CarFactoryBean
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 6:51 PM
 * @Version : 1.0
 **/
public class CarFactoryBean{
	private String carInfo;

	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return car;
	}

	public Class<?> getObjectType() {
		return Car.class;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
