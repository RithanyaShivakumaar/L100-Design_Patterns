export class Person {
  constructor(name) {
    this.name = name;
    this.role = 'Generic';
  }

  markAttendance() {
    throw new Error('markAttendance() must be implemented in subclass');
  }
}
