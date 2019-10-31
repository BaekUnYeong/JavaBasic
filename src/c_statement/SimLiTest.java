package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("나는 금사빠다. yes or no");
		String input = s.nextLine();
		
		// 금사빠 > yes
		if(input.equals("yes")){
			System.out.println("연애할때 끌려다니는 타입이다. yes or no");
			String input1 = s.nextLine();
				// 연애할때 > yes
				if(input1.equals("yes")){
					System.out.println("감정에 솔직한 편이다. yes or no");
					String input2 = s.nextLine();
						// 감정에 > yes
						if(input.equals("yes")){
							System.out.println("이성친구는 존재할 수 없다. yes or no");
							String input3 = s.nextLine();
								// 이성친구 > yes
								if(input.equals("yes")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input4 = s.nextLine();
										// 아무것도 > yes
										if(input4.equals("yes")){
											System.out.println("연애유형은 C 입니다.");
										// 아무것도 > no
										}else if(input4.equals("no")){
											System.out.println("연애유형은 D 입니다.");
										}
								// 이성친구 > no
								}else if(input3.equals("no")){
									System.out.println("연애유형은 B 입니다.");
								}
						// 감정에 > no
						}else if(input2.equals("no")){
							System.out.println("활동적인 데이트가 좋다. yes or no");
							String input3 = s.nextLine();
								// 활동적인 > yes
								if(input3.equals("yes")){
									System.out.println("이성친구는 존재할 수 없다. yes or no");
									String input4 = s.nextLine();
										// 이성친구 > yes
										if(input4.equals("yes")){
											System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
											String input5 = s.nextLine();
											// 아무것도 > yes
											if(input5.equals("yes")){
												System.out.println("연애유형은 C 입니다.");
											// 아무것도 > no
											}else if(input5.equals("no")){
												System.out.println("연애유형은 D 입니다.");
											}
										// 이성친구 > no
										}else if(input3.equals("no")){
											System.out.println("연애유형은 B 입니다.");
										}
								// 활동적인 > no
								}else if(input2.equals("no")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input4 = s.nextLine();
									if(input4.equals("yes")){
										System.out.println("연애유형은 C 입니다.");
									// 아무것도 > no
									}else if(input4.equals("no")){
										System.out.println("연애유형은 D 입니다.");
									}
								}
							}
						
				// 연애할때 > no
				}else if(input1.equals("no")){
					System.out.println("데이트 코스는 미리 짜는게 편하다. yes or no");
					String input2 = s.nextLine();
						// 데이트 > yes
						if(input2.equals("yes")){
							System.out.println("활동적인 데이트가 좋다. yes or no");
							String input3 = s.nextLine();
								// 활동적인 > yes
								if(input3.equals("yes")){
									System.out.println("이성친구는 존재할 수 없다. yes or no");
									String input4 = s.nextLine();
										if(input4.equals("yes")){
											System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
											String input5 = s.nextLine();
											// 아무것도 > yes
											if(input5.equals("yes")){
												System.out.println("연애유형은 C 입니다.");
											// 아무것도 > no
											}else if(input5.equals("no")){
												System.out.println("연애유형은 D 입니다.");
											}
										// 이성친구 > no
										}else if(input4.equals("no")){
											System.out.println("연애유형은 B 입니다.");
										}
								// 활동적인 > no
								}else if(input3.equals("no")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input4 = s.nextLine();
										// 아무것도 > yes
										if(input4.equals("yes")){
											System.out.println("연애유형은 C 입니다.");
										// 아무것도 > no
										}else if(input4.equals("no")){
											System.out.println("연애유형은 D 입니다.");
										}
								}
						// 데이트 > no
						}else if(input2.equals("no")){
							System.out.println("감정표현에 솔직한 편이다. yes or no");
							String input3 = s.nextLine();
								// 감정표현 > yes
								if(input3.equals("yes")){
									System.out.println("이성친구는 존재할 수 없다. yes or no");
									String input4 = s.nextLine();
										if(input4.equals("yes")){
											System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
											String input5 = s.nextLine();
												// 아무것도 > yes
												if(input5.equals("yes")){
													System.out.println("연애유형은 C 입니다.");
												// 아무것도 > no
												}else if(input5.equals("no")){
													System.out.println("연애유형은 D 입니다.");
												}
									// 이성친구 > no
									}else if(input4.equals("no")){
										System.out.println("연애유형은 B 입니다.");
											
							// 감정표현 > no
							}else if(input3.equals("no")){
								System.out.println("활동적인 데이트가 좋다. yes or no");
								String input5 = s.nextLine();
									// 활동적인 > yes
									if(input5.equals("yes")){
										System.out.println("이성친구는 존재할 수 없다. yes or no");
										String input6 = s.nextLine();
											if(input6.equals("yes")){
												System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
												String input7 = s.nextLine();
													// 아무것도 > yes
													if(input7.equals("yes")){
														System.out.println("연애유형은 C 입니다.");
													// 아무것도 > no
													}else if(input7.equals("no")){
														System.out.println("연애유형은 D 입니다.");
													}
											}else if(input6.equals("no")){
												System.out.println("연애유형은 B 입니다.");
											}
									// 활동적인 > no
									}else if(input5.equals("no")){
										System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
										String input6 = s.nextLine();
											// 아무것도 > yes
											if(input6.equals("yes")){
												System.out.println("연애유형은 C 입니다.");
											// 아무것도 > no
											}else if(input6.equals("no")){
												System.out.println("연애유형은 D 입니다.");
											}
										}
									}
								}
							}
				}
		// 금사빠 > no
		}else if(input.equals("no")){
			System.out.println("감정기복이 크지 않다. yes or no");
			String input2 = s.nextLine();
				// 감정기복 > yes
				if(input2.equals("yes")){
					System.out.println("연락이 없어도 믿고 기다리는 편이다. yes or no");
					String input3 = s.nextLine();
						// 연락이 > yes
						if(input3.equals("yes")){
							System.out.println("연애유형은 A 입니다.");
						// 연락이 > no
						}else if(input3.equals("no")){
							System.out.println("이성친구는 존재할 수 없다. yes or no");
							String input4 = s.nextLine();
								if(input4.equals("yes")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input5 = s.nextLine();
										// 아무것도 > yes
										if(input5.equals("yes")){
											System.out.println("연애유형은 C 입니다.");
										// 아무것도 > no
										}else if(input5.equals("no")){
											System.out.println("연애유형은 D 입니다.");
										}
								}
						}
				// 감정기복 > no
				}else if(input2.equals("no")){
					System.out.println("감정표현에 솔직한 편이다. yes or no");
					String input4 = s.nextLine();
						// 감정표현 > yes
						if(input4.equals("yes")){
							System.out.println("이성친구는 존재할 수 없다. yes or no");
							String input5 = s.nextLine();
								if(input5.equals("yes")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input6 = s.nextLine();
										// 아무것도 > yes
										if(input6.equals("yes")){
											System.out.println("연애유형은 C 입니다.");
										// 아무것도 > no
										}else if(input6.equals("no")){
											System.out.println("연애유형은 D 입니다.");
										}
								}
						// 감정표현 > no
						}else if(input4.equals("no")){
							System.out.println("활동적인 데이트가 좋다. yes or no");
							String input6 = s.nextLine();
								// 활동적인 > yes
								if(input6.equals("yes")){
									System.out.println("이성친구는 존재할 수 없다. yes or no");
									String input7 = s.nextLine();
										if(input7.equals("yes")){
											System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
											String input8 = s.nextLine();
												// 아무것도 > yes
												if(input8.equals("yes")){
													System.out.println("연애유형은 C 입니다.");
												// 아무것도 > no
												}else if(input8.equals("no")){
													System.out.println("연애유형은 D 입니다.");
												}
										}
								// 활동적인 > no
								}else if(input6.equals("no")){
									System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓이다. yes or no");
									String input8 = s.nextLine();
										// 아무것도 > yes
										if(input8.equals("yes")){
											System.out.println("연애유형은 C 입니다.");
										// 아무것도 > no
										}else if(input8.equals("no")){
											System.out.println("연애유형은 D 입니다.");
										}
									}
								}
							}
						}
					}
				}
			

