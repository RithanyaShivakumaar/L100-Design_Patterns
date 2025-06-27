export class AttendanceLogger {
  static logs = [];

  static log(person) {
    const entry = {
      name: person.name,
      role: person.role,
      timestamp: new Date().toISOString(),
    };
    this.logs.push(entry);
    console.log(`[Log] Attendance recorded for ${entry.name} (${entry.role})`);
  }

  static exportLogsToConsole() {
    console.log('\n📋 Attendance Log Summary:\n', JSON.stringify(this.logs, null, 2));
  }
}
